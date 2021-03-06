package cat.urv.exception;

/**
 * Exception for invalid conversions of values given in the dataset CSV file
 * and the data type of the attribute given by the user in the metadata.
 * For instance, an attribute named 'age' and the record contains 'Lewis'
 * leads to an invalid value exception.
 * @author Universitat Rovira i Virgili
 */
public class InvalidDataTypeException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String parameter;
	String message;
	
	public InvalidDataTypeException()
	{
		super();
	}
	
	public InvalidDataTypeException(String parameter)
	{
		this.parameter = parameter;
	}
	
	/**
	 * @param message Customized error message to show to the user
	 * @param parameter Attribute where the invalid conversion is found
	 */
	public InvalidDataTypeException(String message, String parameter)
	{
		this.message = message;
		this.parameter = parameter;
	}
	
	public String getParameter()
	{
		return parameter;
	}
	
	@Override
	public String getMessage()
	{
		return this.message;
	}
}
