package impl;

import java.util.List;

import entities.Receipt;

public interface IReceipt {
    
    // create
    public boolean create(Receipt object);

    // update
    public boolean update(Receipt object);

    // delete
    public boolean delete(Receipt object);

    // find by id
    public Receipt findById(Integer receiptId);

    // load list receipt
    public List<Receipt> getAll();
    
}
