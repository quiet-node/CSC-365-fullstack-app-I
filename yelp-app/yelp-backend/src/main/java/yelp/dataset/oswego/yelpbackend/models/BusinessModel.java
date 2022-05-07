package yelp.dataset.oswego.yelpbackend.models;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: Nam (Logan) Nguyen
 * @college: SUNY Oswego
 * @since Spring 2022
 * @version 1.0
 * @link: https://github.com/lgad31vn/CSC-365
 */


@Entity
@Data //setters, getters, toString, hashcode
@AllArgsConstructor
@NoArgsConstructor
@Table(name="yelp")
public class BusinessModel implements Comparable<BusinessModel> {
    @Id
    @GeneratedValue
    private long id; // primary key

    String  business_id, name, address;
    double stars, reviews;
    
    double similarityRate;

    ArrayList<String> categories;

    @Override
    public int compareTo(BusinessModel b) {
        
        return Double.compare(this.getSimilarityRate(), b.similarityRate);
        
    }



    
}
