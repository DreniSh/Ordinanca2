package BLL;

import BLL.Pagesat;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-06-04T15:43:45")
@StaticMetamodel(RregjistrimiPacientit.class)
public class RregjistrimiPacientit_ { 

    public static volatile SingularAttribute<RregjistrimiPacientit, String> emri;
    public static volatile SingularAttribute<RregjistrimiPacientit, String> emriPrindit;
    public static volatile CollectionAttribute<RregjistrimiPacientit, Pagesat> pagesatCollection;
    public static volatile SingularAttribute<RregjistrimiPacientit, String> mbiemri;
    public static volatile SingularAttribute<RregjistrimiPacientit, Date> dataLindjes;
    public static volatile SingularAttribute<RregjistrimiPacientit, Integer> id;
    public static volatile SingularAttribute<RregjistrimiPacientit, String> mosha;

}