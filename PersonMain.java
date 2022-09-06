
public class PersonMain {
		private String name;
		private int perId;
		private long phoneNo;
		public PersonMain(String name, int perId) {
			super();
			this.name = name;
			this.perId = perId;
			System.out.println("Argumented Countructor...");
		}
		public PersonMain() {
			System.out.println("no-argument counstrctor...");
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getPerId() {
			return perId;
		}
		public void setPerId(int perId) {
			this.perId = perId;
		}
		public static void main(String[] args) {
	         PersonMain person=new PersonMain();
	         //PersonMain person=new PersonMain("Alok	",1207);
	         person.getPerId();
	         person.getName();
		}

	}
	    
