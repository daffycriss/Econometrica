package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.CountryDataset;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-03-10T18:07:31")
@StaticMetamodel(CountryData.class)
public class CountryData_ { 

    public static volatile SingularAttribute<CountryData, String> dataYear;
    public static volatile SingularAttribute<CountryData, Integer> id;
    public static volatile SingularAttribute<CountryData, String> value;
    public static volatile SingularAttribute<CountryData, CountryDataset> dataset;

}