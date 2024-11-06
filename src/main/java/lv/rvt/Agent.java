package lv.rvt;

public class Agent {

        private String name;
        private String lastname;

        public Agent(String initialName, String initialLastname) {
            this.name = initialName;
            this.lastname = initialLastname;

        }

        public String toString() {
            return "My name is " +this.name+ ", "+ this.name+" "+ this.lastname;
        }
}
