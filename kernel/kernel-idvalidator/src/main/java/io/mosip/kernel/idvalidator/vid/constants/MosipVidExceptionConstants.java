package io.mosip.kernel.idvalidator.vid.constants;

public enum MosipVidExceptionConstants {
	
	VID_VAL_INVALID_NULL("KER-IDV-001", "Entered VID should not be empty or null."),
	VID_VAL_ILLEGAL_SEQUENCE_REPEATATIVE("KER-IDV-002", "Entered VID should not contain any sequential and repeated block of number for 2 or more than two digits"), 
	VID_VAL_ILLEGAL_LENGTH("KER-IDV-003", "Entered VID length should be 16 digit."), 
	VID_VAL_INVALID_DIGITS("KER-IDV-004", "Entered VID should not contain any alphanumeric characters."), 
	VID_VAL_ILLEGAL_CHECKSUM("KER-IDV-005", "Entered VID should match checksum."),
	VID_VAL_INVALID_ZERO_ONE("KER-IDV-006", "Entered VID should not contain Zero or One as first Digit.");
	
	
	/**
	 * This variable holds the error code.
	 */
	private String errorCode;

	/**
	 * This variable holds the error message.
	 */
	private String errorMessage;

	/**
	 * Constructor for VIDErrorConstants Enum.
	 * 
	 * @param errorCode
	 *            the error code.
	 * @param errorMessage
	 *            the error message.
	 */
	MosipVidExceptionConstants(String errorCode, String errorMessage) {
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}

	/**
	 * Getter for errorCode.
	 * 
	 * @return the error code.
	 */
	public String getErrorCode() {
		return errorCode;
	}

	/**
	 * Getter for errorMessage.
	 * 
	 * @return the error message.
	 */
	public String getErrorMessage() {
		return errorMessage;
	}

}
