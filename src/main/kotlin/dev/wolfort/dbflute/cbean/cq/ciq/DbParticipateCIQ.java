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
 * The condition-query for in-line of participate.
 * @author DBFlute(AutoGenerator)
 */
public class DbParticipateCIQ extends DbAbstractBsParticipateCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected DbBsParticipateCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public DbParticipateCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, DbBsParticipateCQ myCQ) {
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
    protected ConditionValue xgetCValueParticipateId() { return _myCQ.xdfgetParticipateId(); }
    public String keepParticipateId_ExistsReferrer_ParticipateRoleList(DbParticipateRoleCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepParticipateId_ExistsReferrer_ParticipateRuleBookList(DbParticipateRuleBookCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepParticipateId_NotExistsReferrer_ParticipateRoleList(DbParticipateRoleCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepParticipateId_NotExistsReferrer_ParticipateRuleBookList(DbParticipateRuleBookCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepParticipateId_SpecifyDerivedReferrer_ParticipateRoleList(DbParticipateRoleCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepParticipateId_SpecifyDerivedReferrer_ParticipateRuleBookList(DbParticipateRuleBookCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepParticipateId_QueryDerivedReferrer_ParticipateRoleList(DbParticipateRoleCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepParticipateId_QueryDerivedReferrer_ParticipateRoleListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepParticipateId_QueryDerivedReferrer_ParticipateRuleBookList(DbParticipateRuleBookCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepParticipateId_QueryDerivedReferrer_ParticipateRuleBookListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValueScenarioId() { return _myCQ.xdfgetScenarioId(); }
    protected ConditionValue xgetCValueUserId() { return _myCQ.xdfgetUserId(); }
    protected ConditionValue xgetCValueDispOrder() { return _myCQ.xdfgetDispOrder(); }
    protected ConditionValue xgetCValueRegisterDatetime() { return _myCQ.xdfgetRegisterDatetime(); }
    protected ConditionValue xgetCValueRegisterTrace() { return _myCQ.xdfgetRegisterTrace(); }
    protected ConditionValue xgetCValueUpdateDatetime() { return _myCQ.xdfgetUpdateDatetime(); }
    protected ConditionValue xgetCValueUpdateTrace() { return _myCQ.xdfgetUpdateTrace(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(DbParticipateCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(DbParticipateCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(DbParticipateCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(DbParticipateCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return DbParticipateCB.class.getName(); }
    protected String xinCQ() { return DbParticipateCQ.class.getName(); }
}
