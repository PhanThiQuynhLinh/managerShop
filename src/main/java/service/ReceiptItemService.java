package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.ReceiptItemDao;
import entities.ReceiptItem;
import impl.IReceiptItem;

/**
 *
 * @author TVD
 */
@Service
public class ReceiptItemService implements IReceiptItem {

    @Autowired
    private ReceiptItemDao receiptItemDao;

   
    public boolean create(ReceiptItem object) {
        return receiptItemDao.create(object);
    }

   
    public boolean update(ReceiptItem object) {
        return receiptItemDao.update(object);
    }

   
    public boolean delete(ReceiptItem object) {
        return receiptItemDao.delete(object);
    }

   
    public ReceiptItem findById(Integer receiptItemId) {
        return receiptItemDao.findById(receiptItemId);
    }

   
    public List<ReceiptItem> getListByReceipt(Integer getListByReceipt) {
        return receiptItemDao.getListByReceipt(getListByReceipt);
    }

}