package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.CountryDataset;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-03-10T18:07:31")
@StaticMetamodel(Country.class)
public class Country_ { 

    public static volatile SingularAttribute<Country, String> isoCode;
    public static volatile ListAttribute<Country, CountryDataset> countryDatasetList;
    public static volatile SingularAttribute<Country, String> name;

}