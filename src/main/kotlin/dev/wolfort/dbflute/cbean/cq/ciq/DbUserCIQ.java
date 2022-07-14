package dev.wolfort.dbflute.cbean.cq.ciq;

import java.util.Map;
import org.dbflute.cbean.*;
import org.dbflute.cbean.ckey.*;
import org.dbflute.cbean.coption.ConditionOption;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import dev.wolfort.dbflute.cbean.*;
import dev.wolfort.dbflute.cbean.cq.bs.*;
import dev.wolfort.dbflute.cbean.cq.*;

/**
 * The condition-query for in-line of user.
 * @author DBFlute(AutoGenerator)
 */
public class DbUserCIQ extends DbAbstractBsUserCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected DbBsUserCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public DbUserCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, DbBsUserCQ myCQ) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
        _myCQ = myCQ;
        _foreignPropertyName = _myCQ.xgetForeignPropertyName(); // accept foreign property name
        _relationPath = _myCQ.xgetRelationPath(); // accept relation path
        _inline = true;
    }

    // ===================================================================================
    //                                                             Override about Register
    //                                                             =======================
    protected void reflectRelationOnUnionQuery(ConditionQuery bq, ConditionQuery uq)
    { throw new IllegalConditionBeanOperationException("InlineView cannot use Union: " + bq + " : " + uq); }

    @Override
    protected void setupConditionValueAndRegisterWhereClause(ConditionKey k, Object v, ConditionValue cv, String col)
    { regIQ(k, v, cv, col); }

    @Override
    protected void setupConditionValueAndRegisterWhereClause(ConditionKey k, Object v, ConditionValue cv, String col, ConditionOption op)
    { regIQ(k, v, cv, col, op); }

    @Override
    protected void registerWhereClause(String wc)
    { registerInlineWhereClause(wc); }

    @Override
    protected boolean isInScopeRelationSuppressLocalAliasName() {
        if (_onClause) { throw new IllegalConditionBeanOperationException("InScopeRelation on OnClause is unsupported."); }
        return true;
    }

    // ===================================================================================
    //                                                                Override about Query
    //                                                                ====================
    protected ConditionValue xgetCValueUserId() { return _myCQ.xdfgetUserId(); }
    public String keepUserId_ExistsReferrer_ParticipateList(DbParticipateCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepUserId_NotExistsReferrer_ParticipateList(DbParticipateCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepUserId_SpecifyDerivedReferrer_ParticipateList(DbParticipateCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepUserId_QueryDerivedReferrer_ParticipateList(DbParticipateCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepUserId_QueryDerivedReferrer_ParticipateListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValueUserName() { return _myCQ.xdfgetUserName(); }
    protected ConditionValue xgetCValueUid() { return _myCQ.xdfgetUid(); }
    protected ConditionValue xgetCValueAuthority() { return _myCQ.xdfgetAuthority(); }
    protected ConditionValue xgetCValueIntroduction() { return _myCQ.xdfgetIntroduction(); }
    protected ConditionValue xgetCValueRegisterDatetime() { return _myCQ.xdfgetRegisterDatetime(); }
    protected ConditionValue xgetCValueRegisterTrace() { return _myCQ.xdfgetRegisterTrace(); }
    protected ConditionValue xgetCValueUpdateDatetime() { return _myCQ.xdfgetUpdateDatetime(); }
    protected ConditionValue xgetCValueUpdateTrace() { return _myCQ.xdfgetUpdateTrace(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(DbUserCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(DbUserCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(DbUserCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(DbUserCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return DbUserCB.class.getName(); }
    protected String xinCQ() { return DbUserCQ.class.getName(); }
}
