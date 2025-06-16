package studentMark;
@SuppressWarnings("serial")
class StudentNameAlreadyExists extends RuntimeException{
	
	public StudentNameAlreadyExists(String s){
		super(s);
	}
}
@SuppressWarnings("serial")
class RollNoNameAlreadyExists extends RuntimeException{
	
	public RollNoNameAlreadyExists(String s){
		super(s);
	}
}
@SuppressWarnings("serial")
class InvalidMarkException extends RuntimeException{
	
	public InvalidMarkException(String s){
		super(s);
	}
}

