package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import dto.Member;
import mvjsp.jdbc.JdbcUtil;

public class MemberDao {
    // 싱글턴
    private static MemberDao instance = new MemberDao();

    public static MemberDao getInstance() {
        return instance;
    }

    private MemberDao() {
    }

    public int selectCount(Connection conn) throws SQLException {
        Statement stmt = null;
        ResultSet rs = null;
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery("select count(*) from member");
            rs.next();
            return rs.getInt(1);
        } finally {
            JdbcUtil.close(rs);
            JdbcUtil.close(stmt);
        }
    }//selectCount 메서드는 데이터베이스에서 회원 수를 세는 쿼리를 실행하는 메서드입니다.

    public ArrayList<dto.Member> selectAll(Connection conn) {
        ArrayList<dto.Member> mList = new ArrayList<>();
        String mSql = "select * from member";
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            pstmt = conn.prepareStatement(mSql);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                dto.Member member = new dto.Member(rs.getInt("memberno"), rs.getString("id"), rs.getString("email"),
                        rs.getString("name"));
                mList.add(member);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcUtil.close(rs);
            JdbcUtil.close(pstmt);
        }
        return mList;
    }

    public int insert(Connection conn, Member member) {
        String mSql = "insert into member(memberno,id, email, name) values (seq_member.nextval,?,?,?)";
        try (PreparedStatement pstmt = conn.prepareStatement(mSql)) {

            // 쿼리 실행
            pstmt.setString(1, member.getId());

            pstmt.setString(2, member.getEmail());
            pstmt.setString(3, member.getName());
            return pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int update(Connection conn, Member member) {
        String mSql = "update member set email = ?, name = ? where memberno = ?";
        // 프라이머리키로 업데이트
        try (PreparedStatement pstmt = conn.prepareStatement(mSql)) {

            // 쿼리 실행
            pstmt.setInt(3, member.getMemberno()); // 위의 3번 물음표.
            // pstmt.setString(1, member.getId());

            pstmt.setString(1, member.getEmail());
            pstmt.setString(2, member.getName());
            return pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int delete(Connection conn, int memberno) {
        String mSql = "delete from member where memberno=?";
        // 프라이머리키로 업데이트
        try (PreparedStatement pstmt = conn.prepareStatement(mSql)) {

            // 쿼리 실행
            pstmt.setInt(1, memberno);
            // pstmt.setString(1, member.getId());
            // pstmt.setString(1, member.getEmail());
            // pstmt.setString(2, member.getName());
            return pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public Member select(Connection conn, int memberno) {
        Member member = null;
        ResultSet rs = null;
        String mSql = "select * from member where memberno = ?";

        try (PreparedStatement pstmt = conn.prepareStatement(mSql)) {

            pstmt.setInt(1, memberno);
            rs = pstmt.executeQuery();

            if (rs.next()) {
                member = new Member(rs.getInt("memberno"), rs.getString("id"), rs.getString("email"),
                        rs.getString("name"));

            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcUtil.close(rs);

        }
        return member;

    }

    // 새로운 쿼리 추가
    public Member selectForLogin(Connection conn, String id, String email) {
        Member member = null;
        String mSql = "select * from member where id = ? and email = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(mSql)) {
            pstmt.setString(1, id);
            pstmt.setString(2, email);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                member = new Member(rs.getInt("memberno"), rs.getString("id"), rs.getString("email"),
                        rs.getString("name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return member;
    }
    
 //위의 selectForLogin 메서드는 주어진 아이디와 이메일을 사용하여 회원을 검색하는 메서드입니다. 이 메서드는 주어진 Connection을 사용하여 데이터베이스에 쿼리를 실행하고, 해당하는 회원 정보를 가져옵니다.

//구체적으로는 다음을 수행합니다:
//
//주어진 아이디와 이메일을 조건으로 하여 데이터베이스에서 회원 정보를 검색하는 SQL 쿼리를 실행합니다.
//SQL 쿼리의 결과를 처리하여 결과 세트에서 첫 번째 행의 회원 정보를 추출합니다.
//회원 정보가 존재하면 그 정보를 Member 객체로 만들어 반환합니다.
//만약 SQL 쿼리 실행 중에 예외가 발생하면 예외를 처리하고 null을 반환합니다.
//이 메서드는 주로 회원 로그인 기능에서 사용될 수 있습니다. 주어진 아이디와 이메일이 일치하는 회원이 존재하는지 확인하고, 해당 회원 정보를 가져와 로그인 시 필요한 추가적인 검증 및 처리를 수행할 수 있습니다.
}