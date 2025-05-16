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
 * The condition-query for in-line of game_system.
 * @author DBFlute(AutoGenerator)
 */
public class DbGameSystemCIQ extends DbAbstractBsGameSystemCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected DbBsGameSystemCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public DbGameSystemCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, DbBsGameSystemCQ myCQ) {
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
    protected ConditionValue xgetCValueGameSystemId() { return _myCQ.xdfgetGameSystemId(); }
    public String keepGameSystemId_ExistsReferrer_GameSystemDictionaryList(DbGameSystemDictionaryCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepGameSystemId_ExistsReferrer_ParticipateList(DbParticipateCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepGameSystemId_ExistsReferrer_RuleBookList(DbRuleBookCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepGameSystemId_ExistsReferrer_ScenarioGameSystemList(DbScenarioGameSystemCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepGameSystemId_NotExistsReferrer_GameSystemDictionaryList(DbGameSystemDictionaryCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepGameSystemId_NotExistsReferrer_ParticipateList(DbParticipateCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepGameSystemId_NotExistsReferrer_RuleBookList(DbRuleBookCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepGameSystemId_NotExistsReferrer_ScenarioGameSystemList(DbScenarioGameSystemCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepGameSystemId_SpecifyDerivedReferrer_GameSystemDictionaryList(DbGameSystemDictionaryCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepGameSystemId_SpecifyDerivedReferrer_ParticipateList(DbParticipateCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepGameSystemId_SpecifyDerivedReferrer_RuleBookList(DbRuleBookCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepGameSystemId_SpecifyDerivedReferrer_ScenarioGameSystemList(DbScenarioGameSystemCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepGameSystemId_QueryDerivedReferrer_GameSystemDictionaryList(DbGameSystemDictionaryCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepGameSystemId_QueryDerivedReferrer_GameSystemDictionaryListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepGameSystemId_QueryDerivedReferrer_ParticipateList(DbParticipateCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepGameSystemId_QueryDerivedReferrer_ParticipateListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepGameSystemId_QueryDerivedReferrer_RuleBookList(DbRuleBookCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepGameSystemId_QueryDerivedReferrer_RuleBookListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepGameSystemId_QueryDerivedReferrer_ScenarioGameSystemList(DbScenarioGameSystemCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepGameSystemId_QueryDerivedReferrer_ScenarioGameSystemListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValueGameSystemName() { return _myCQ.xdfgetGameSystemName(); }
    protected ConditionValue xgetCValueRegisterDatetime() { return _myCQ.xdfgetRegisterDatetime(); }
    protected ConditionValue xgetCValueRegisterTrace() { return _myCQ.xdfgetRegisterTrace(); }
    protected ConditionValue xgetCValueUpdateDatetime() { return _myCQ.xdfgetUpdateDatetime(); }
    protected ConditionValue xgetCValueUpdateTrace() { return _myCQ.xdfgetUpdateTrace(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(DbGameSystemCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(DbGameSystemCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(DbGameSystemCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(DbGameSystemCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return DbGameSystemCB.class.getName(); }
    protected String xinCQ() { return DbGameSystemCQ.class.getName(); }
}
