package java0125;

class Person {
    String name;
    int age;
    String gender;
 
    // 같은 자료형의 매개변수로 오버로딩 할 수 없다.
    Person(String name, int age) { 
        this.name = name;
        this.age = age; 
    }

    // 같은 자료형의 매개변수로 오버로딩 할 수 없다.
//    Person(String gender, int age) { 
//        this.gender = gender;
//        this.age = age;
//    }
    
    Person(int age) { 
        this.gender = gender;
        this.age = age;
    }
}
