package dev.wolfort.dbflute.cbean.nss;

import dev.wolfort.dbflute.cbean.cq.DbUserRuleBookCQ;

/**
 * The nest select set-upper of user_rule_book.
 * @author DBFlute(AutoGenerator)
 */
public class DbUserRuleBookNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final DbUserRuleBookCQ _query;
    public DbUserRuleBookNss(DbUserRuleBookCQ query) { _query = query; }
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
    /**
     * With nested relation columns to select clause. <br>
     * USER by my user_id, named 'user'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public DbUserNss withUser() {
        _query.xdoNss(() -> _query.queryUser());
        return new DbUserNss(_query.queryUser());
    }
}
