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
 * The condition-query for in-line of rule_book.
 * @author DBFlute(AutoGenerator)
 */
public class DbRuleBookCIQ extends DbAbstractBsRuleBookCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected DbBsRuleBookCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public DbRuleBookCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, DbBsRuleBookCQ myCQ) {
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
    protected ConditionValue xgetCValueRuleBookId() { return _myCQ.xdfgetRuleBookId(); }
    public String keepRuleBookId_ExistsReferrer_RuleBookDictionaryList(DbRuleBookDictionaryCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepRuleBookId_ExistsReferrer_ScenarioList(DbScenarioCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepRuleBookId_NotExistsReferrer_RuleBookDictionaryList(DbRuleBookDictionaryCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepRuleBookId_NotExistsReferrer_ScenarioList(DbScenarioCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepRuleBookId_SpecifyDerivedReferrer_RuleBookDictionaryList(DbRuleBookDictionaryCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepRuleBookId_SpecifyDerivedReferrer_ScenarioList(DbScenarioCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepRuleBookId_QueryDerivedReferrer_RuleBookDictionaryList(DbRuleBookDictionaryCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepRuleBookId_QueryDerivedReferrer_RuleBookDictionaryListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepRuleBookId_QueryDerivedReferrer_ScenarioList(DbScenarioCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepRuleBookId_QueryDerivedReferrer_ScenarioListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValueRuleBookName() { return _myCQ.xdfgetRuleBookName(); }
    protected ConditionValue xgetCValueRegisterDatetime() { return _myCQ.xdfgetRegisterDatetime(); }
    protected ConditionValue xgetCValueRegisterTrace() { return _myCQ.xdfgetRegisterTrace(); }
    protected ConditionValue xgetCValueUpdateDatetime() { return _myCQ.xdfgetUpdateDatetime(); }
    protected ConditionValue xgetCValueUpdateTrace() { return _myCQ.xdfgetUpdateTrace(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(DbRuleBookCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(DbRuleBookCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(DbRuleBookCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(DbRuleBookCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return DbRuleBookCB.class.getName(); }
    protected String xinCQ() { return DbRuleBookCQ.class.getName(); }
}
