package service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.ReceiptDao;
import entities.Receipt;
import impl.IReceipt;

/**
 *
 * @author TVD
 */
@Service
public class ReceiptService implements IReceipt {

    @Autowired
    private ReceiptDao receiptDao;

   
    public boolean create(Receipt object) {
        return receiptDao.create(object);
    }

   
    public boolean update(Receipt object) {
        return receiptDao.update(object);
    }

   
    public boolean delete(Receipt object) {
        return receiptDao.delete(object);
    }

   
    public Receipt findById(Integer receiptId) {
        return receiptDao.findById(receiptId);
    }

   
    public List<Receipt> getAll() {
        return receiptDao.getAll();
    }

}
