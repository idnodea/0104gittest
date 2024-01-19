package exam03;

public class MySqlDao implements DataAccessObject{

	@Override
	public void select() {
		// TODO Auto-generated method stub
		System.out.println("Mysql select");
	}

	@Override
	public void insert() {
		System.out.println("Mysql insert");
		
	}

	@Override
	public void update() {
		System.out.println("Mysql update");
		
	}

	@Override
	public void delete() {
		System.out.println("Mysql delete");
		
	}

}
