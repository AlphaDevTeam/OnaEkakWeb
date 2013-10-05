
package com.AlphaDevs.Comercial.OnaEkak.Core;

import com.AlphaDevs.Comercial.OnaEkak.Entities.Image;
import com.AlphaDevs.Comercial.OnaEkak.Enums.ProductType;
import java.util.Date;
import java.util.List;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Mihindu Karunarathne 
 * Alpha Development Team (Pvt) Ltd
 */
@MappedSuperclass
public class Products {
    @Temporal(TemporalType.DATE)
    protected Date createdDate;
    protected Double price;
    protected ProductType productType;
    @OneToMany
    protected List<Image> imgList;
    
}
