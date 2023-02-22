import java.io.Serializable;

public class Person implements Serializable {
            private transient int  id;
            private String name;
            public Person(String name, int id){
                this.name = name;
                this.id = id;
            }
            public int getId() {
                return id;
            }
            public String getName() {
                return name;
            }
            public String toString(){
                return id + ":" + name;
            }
        }
