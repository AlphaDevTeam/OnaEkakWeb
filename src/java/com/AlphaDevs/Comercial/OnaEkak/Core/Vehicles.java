
package com.AlphaDevs.Comercial.OnaEkak.Core;

import com.AlphaDevs.Comercial.OnaEkak.Enums.ProductType;
import java.util.Date;
import java.util.List;
import javax.persistence.MappedSuperclass;

/**
 *
 * @author Mihindu Karunarathne 
 * Alpha Development Team (Pvt) Ltd
 */
@MappedSuperclass
public class Vehicles extends Products {
    protected String year;
    protected String model;
    protected String vehivleNo;
    
    public Vehicles(){
        productType = ProductType.VEHICLE;
    }

      
    
}
