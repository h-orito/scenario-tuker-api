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
 * The condition-query for in-line of scenario.
 * @author DBFlute(AutoGenerator)
 */
public class DbScenarioCIQ extends DbAbstractBsScenarioCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected DbBsScenarioCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public DbScenarioCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, DbBsScenarioCQ myCQ) {
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
    protected ConditionValue xgetCValueScenarioId() { return _myCQ.xdfgetScenarioId(); }
    public String keepScenarioId_ExistsReferrer_ParticipateList(DbParticipateCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepScenarioId_ExistsReferrer_ScenarioAuthorList(DbScenarioAuthorCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepScenarioId_ExistsReferrer_ScenarioDictionaryList(DbScenarioDictionaryCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepScenarioId_NotExistsReferrer_ParticipateList(DbParticipateCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepScenarioId_NotExistsReferrer_ScenarioAuthorList(DbScenarioAuthorCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepScenarioId_NotExistsReferrer_ScenarioDictionaryList(DbScenarioDictionaryCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepScenarioId_SpecifyDerivedReferrer_ParticipateList(DbParticipateCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepScenarioId_SpecifyDerivedReferrer_ScenarioAuthorList(DbScenarioAuthorCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepScenarioId_SpecifyDerivedReferrer_ScenarioDictionaryList(DbScenarioDictionaryCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepScenarioId_QueryDerivedReferrer_ParticipateList(DbParticipateCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepScenarioId_QueryDerivedReferrer_ParticipateListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepScenarioId_QueryDerivedReferrer_ScenarioAuthorList(DbScenarioAuthorCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepScenarioId_QueryDerivedReferrer_ScenarioAuthorListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepScenarioId_QueryDerivedReferrer_ScenarioDictionaryList(DbScenarioDictionaryCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepScenarioId_QueryDerivedReferrer_ScenarioDictionaryListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValueScenarioName() { return _myCQ.xdfgetScenarioName(); }
    protected ConditionValue xgetCValueScenarioType() { return _myCQ.xdfgetScenarioType(); }
    protected ConditionValue xgetCValueScenarioUrl() { return _myCQ.xdfgetScenarioUrl(); }
    protected ConditionValue xgetCValueGameSystemId() { return _myCQ.xdfgetGameSystemId(); }
    protected ConditionValue xgetCValueRegisterDatetime() { return _myCQ.xdfgetRegisterDatetime(); }
    protected ConditionValue xgetCValueRegisterTrace() { return _myCQ.xdfgetRegisterTrace(); }
    protected ConditionValue xgetCValueUpdateDatetime() { return _myCQ.xdfgetUpdateDatetime(); }
    protected ConditionValue xgetCValueUpdateTrace() { return _myCQ.xdfgetUpdateTrace(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(DbScenarioCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(DbScenarioCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(DbScenarioCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(DbScenarioCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return DbScenarioCB.class.getName(); }
    protected String xinCQ() { return DbScenarioCQ.class.getName(); }
}
