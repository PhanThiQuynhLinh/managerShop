package entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity(name = "receipt")
public class Receipt {
	 	@Id
	    @GeneratedValue
	    private int receiptId;
	 	
	 	@Column(name = "receiptName")
	    private String receiptName;
	 	
	 	@Column(name = "receiptMail")
	    private String receiptMail;
	 	
	 	@Column(name = "receiptAddress")
	    private String receiptAddress;
	 		 
	    @OneToMany(fetch = FetchType.LAZY)
	    @JoinColumn(name = "receiptItemId")
	    private List<ReceiptItem> listReceiptItem;

		public Receipt() {
		}

		public Receipt(int receiptId, String receiptName, String receiptMail, String receiptAddress,
				List<ReceiptItem> listReceiptItem) {
			super();
			this.receiptId = receiptId;
			this.receiptName = receiptName;
			this.receiptMail = receiptMail;
			this.receiptAddress = receiptAddress;
			this.listReceiptItem = listReceiptItem;
		}

		public Receipt(int receiptId, String receiptName, String receiptMail, String receiptAddress) {
			super();
			this.receiptId = receiptId;
			this.receiptName = receiptName;
			this.receiptMail = receiptMail;
			this.receiptAddress = receiptAddress;
		}

		


	 	
	 	
}
