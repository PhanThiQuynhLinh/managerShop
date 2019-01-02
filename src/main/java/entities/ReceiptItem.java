package entities;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity(name = "receiptitem")
public class ReceiptItem {
	
	 	@Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private int receiptItemId;
	 	
	    @Column(name = "receiptItemQuantity")
	    private int receiptItemQuantity;
	    
	    @Column(name = "receiptItemPrice")
	    private double receiptItemPrice;
	    
	    @Column(name = "receiptItemSale")
	    private int receiptItemSale;
	    
	    @Column(name = "receiptItemDate")
	    private Date receiptItemDate;
	    
	    @ManyToOne(fetch = FetchType.LAZY)
	    @JoinColumn(name = "receiptId")
	    private Receipt receipt;
	    
	    @ManyToMany(fetch = FetchType.LAZY)
	    @JoinTable(name = "product_receipitem", 
	    			joinColumns = {@JoinColumn(name = "receiptItemId")},
	    			inverseJoinColumns = {@JoinColumn(name = "productId")})
	    private Set<Product> products;
		public ReceiptItem() {
		}
		public ReceiptItem(int receiptItemId, int receiptItemQuantity, double receiptItemPrice, int receiptItemSale,
				Date receiptItemDate, Receipt receipt, Set<Product> products) {
			super();
			this.receiptItemId = receiptItemId;
			this.receiptItemQuantity = receiptItemQuantity;
			this.receiptItemPrice = receiptItemPrice;
			this.receiptItemSale = receiptItemSale;
			this.receiptItemDate = receiptItemDate;
			this.receipt = receipt;
			this.products = products;
		}
		public ReceiptItem(int receiptItemId, int receiptItemQuantity, double receiptItemPrice, int receiptItemSale,
				Date receiptItemDate) {
			super();
			this.receiptItemId = receiptItemId;
			this.receiptItemQuantity = receiptItemQuantity;
			this.receiptItemPrice = receiptItemPrice;
			this.receiptItemSale = receiptItemSale;
			this.receiptItemDate = receiptItemDate;
		}
		public int getReceiptItemId() {
			return receiptItemId;
		}
		public void setReceiptItemId(int receiptItemId) {
			this.receiptItemId = receiptItemId;
		}
		public int getReceiptItemQuantity() {
			return receiptItemQuantity;
		}
		public void setReceiptItemQuantity(int receiptItemQuantity) {
			this.receiptItemQuantity = receiptItemQuantity;
		}
		public double getReceiptItemPrice() {
			return receiptItemPrice;
		}
		public void setReceiptItemPrice(double receiptItemPrice) {
			this.receiptItemPrice = receiptItemPrice;
		}
		public int getReceiptItemSale() {
			return receiptItemSale;
		}
		public void setReceiptItemSale(int receiptItemSale) {
			this.receiptItemSale = receiptItemSale;
		}
		public Date getReceiptItemDate() {
			return receiptItemDate;
		}
		public void setReceiptItemDate(Date receiptItemDate) {
			this.receiptItemDate = receiptItemDate;
		}
		public Receipt getReceipt() {
			return receipt;
		}
		public void setReceipt(Receipt receipt) {
			this.receipt = receipt;
		}
		public Set<Product> getProducts() {
			return products;
		}
		public void setProducts(Set<Product> products) {
			this.products = products;
		}

		
	    
}
