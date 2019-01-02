package impl;

import java.util.List;

import entities.ReceiptItem;


public interface IReceiptItem {
    
    // create
    public boolean create(ReceiptItem object);

    // update
    public boolean update(ReceiptItem object);

    // delete
    public boolean delete(ReceiptItem object);

    // find by id
    public ReceiptItem findById(Integer receiptItemId);

    // load list receipt item
    public List<ReceiptItem> getListByReceipt(Integer receiptId);
    
}
