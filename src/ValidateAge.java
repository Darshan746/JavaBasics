
public class ValidateAge {
	
	public void validate(int age) throws InvalidAgeException  {
		if(age<18) {
			throw new InvalidAgeException("You are too Small to Vote");
		}
		else{
			System.out.println("you can vote");
		}
	}
	public static void main(String args[]){
		
		ValidateAge a = new  ValidateAge();
		try {
			a.validate(17);
		} catch (InvalidAgeException e) {
			// TODO Auto-generated catch block
			e.getCause();
			e.printStackTrace();
		}
	}

}
