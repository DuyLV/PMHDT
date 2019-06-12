package shopbanhang.catalog;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QDienThoai is a Querydsl query type for DienThoai
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QDienThoai extends EntityPathBase<DienThoai> {

    private static final long serialVersionUID = 1624756477L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QDienThoai dienThoai = new QDienThoai("dienThoai");

    public final org.salespointframework.catalog.QProduct _super;

    //inherited
    public final SetPath<String, StringPath> categories;

    public final EnumPath<DienThoai.HangTypes> hang = createEnum("hang", DienThoai.HangTypes.class);

    public final StringPath hinhAnh = createString("hinhAnh");

    //inherited
    public final EnumPath<org.salespointframework.quantity.Metric> metric;

    public final StringPath moTa = createString("moTa");

    //inherited
    public final StringPath name;

    //inherited
    public final SimplePath<javax.money.MonetaryAmount> price;

    // inherited
    public final org.salespointframework.catalog.QProductIdentifier productIdentifier;

    public final NumberPath<Integer> soLuong = createNumber("soLuong", Integer.class);

    public QDienThoai(String variable) {
        this(DienThoai.class, forVariable(variable), INITS);
    }

    public QDienThoai(Path<? extends DienThoai> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QDienThoai(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QDienThoai(PathMetadata metadata, PathInits inits) {
        this(DienThoai.class, metadata, inits);
    }

    public QDienThoai(Class<? extends DienThoai> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new org.salespointframework.catalog.QProduct(type, metadata, inits);
        this.categories = _super.categories;
        this.metric = _super.metric;
        this.name = _super.name;
        this.price = _super.price;
        this.productIdentifier = _super.productIdentifier;
    }

}

