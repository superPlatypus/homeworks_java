package practice_2;
/////////
public class _1 {
    public static void main(String[] args) {

    }
    private class Author{
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public char getGender() {
            return gender;
        }

        public void setGender(char gender) {
            this.gender = gender;
        }

        private String name;
        private String email;
        private char gender;


        private Author() {
        }
    }

}
