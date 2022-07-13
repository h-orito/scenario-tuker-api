package dev.wolfort.dbflute.cbean.nss;

import dev.wolfort.dbflute.cbean.cq.DbRuleBookDictionaryCQ;

/**
 * The nest select set-upper of rule_book_dictionary.
 * @author DBFlute(AutoGenerator)
 */
public class DbRuleBookDictionaryNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final DbRuleBookDictionaryCQ _query;
    public DbRuleBookDictionaryNss(DbRuleBookDictionaryCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * RULE_BOOK by my rule_book_id, named 'ruleBook'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public DbRuleBookNss withRuleBook() {
        _query.xdoNss(() -> _query.queryRuleBook());
        return new DbRuleBookNss(_query.queryRuleBook());
    }
}
