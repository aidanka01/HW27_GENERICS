/*     Box деген generic класс тузунуз.
        Ичинде Box деген объектти кайтарган статический generic метод болсун.*/
       public class Box <T>{
            private T form;

            public Box() {
                this.form = form;

            }

            public static <T> Box<T> boxMethod(){
                return new Box<>();
            }

     @Override
    public String toString() {
        return "Box{" +
                "form=" + form +
                '}';
    }

     public static void main(String[] args) {
                System.out.println(boxMethod());



            }

        }


