package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Country;
import model.CountryData;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-03-10T18:07:31")
@StaticMetamodel(CountryDataset.class)
public class CountryDataset_ { 

    public static volatile SingularAttribute<CountryDataset, Country> countryCode;
    public static volatile SingularAttribute<CountryDataset, String> startYear;
    public static volatile SingularAttribute<CountryDataset, String> name;
    public static volatile SingularAttribute<CountryDataset, String> description;
    public static volatile SingularAttribute<CountryDataset, Integer> datasetId;
    public static volatile ListAttribute<CountryDataset, CountryData> countryDataList;
    public static volatile SingularAttribute<CountryDataset, String> endYear;

}