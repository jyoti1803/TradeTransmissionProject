package tradeTransmissionProject;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Trade {

	private String tradeId;
	private int version;
	private String counterPartyId;
	private String bookId;
	private Date maturityDate;
	private Date createdDate;
	private char expired;
	
	
	public Trade(String tradeId, int version, String counterPartyId, String bookId, Date maturityDate, Date createdDate,
			char expired) {
		super();
		this.tradeId = tradeId;
		this.version = version;
		this.counterPartyId = counterPartyId;
		this.bookId = bookId;
		this.maturityDate = maturityDate;
		this.createdDate = createdDate;
		this.expired = expired;
	}
	
	public String getTradeId() {
		return tradeId;
	}
	public void setTradeId(String tradeId) {
		this.tradeId = tradeId;
	}
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	public String getCounterPartyId() {
		return counterPartyId;
	}
	public void setCounterPartyId(String counterPartyId) {
		this.counterPartyId = counterPartyId;
	}
	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	public Date getMaturityDate() {
		return maturityDate;
	}
	public void setMaturityDate(Date maturityDate) {
		this.maturityDate = maturityDate;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public char getExpired() {
		return expired;
	}
	public void setExpired(char expired) {
		this.expired = expired;
	}
	@Override
	public String toString() {
		SimpleDateFormat sdformat = new SimpleDateFormat("dd/MM/yyyy");
		
		 return ""+tradeId+" "+version+" "+counterPartyId+" "+bookId+" "+sdformat.format(maturityDate)+" "+sdformat.format(createdDate)+" "+expired;
	
	}
	
	
}
