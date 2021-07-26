package co.com.foodbank.packaked.item;

import co.com.foodbank.contribution.dto.IContribution;
import co.com.foodbank.product.dto.IProduct;

/**
 * @author mauricio.londono@gmail.com co.com.foodbank.packaked.item 26/07/2021
 */
public class Item {

    private IProduct product;
    private IContribution contribution;
    private Long units;


    /**
     * Default constructor.
     */
    public Item() {}


    public IProduct getProduct() {
        return product;
    }


    public void setProduct(IProduct product) {
        this.product = product;
    }


    public IContribution getContribution() {
        return contribution;
    }


    public void setContribution(IContribution contribution) {
        this.contribution = contribution;
    }


    public Long getUnits() {
        return units;
    }


    public void setUnits(Long units) {
        this.units = units;
    }



}
