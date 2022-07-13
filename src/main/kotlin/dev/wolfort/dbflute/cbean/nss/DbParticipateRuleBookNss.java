package dev.wolfort.dbflute.cbean.nss;

import dev.wolfort.dbflute.cbean.cq.DbParticipateRuleBookCQ;

/**
 * The nest select set-upper of participate_rule_book.
 * @author DBFlute(AutoGenerator)
 */
public class DbParticipateRuleBookNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final DbParticipateRuleBookCQ _query;
    public DbParticipateRuleBookNss(DbParticipateRuleBookCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * PARTICIPATE by my participate_id, named 'participate'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public DbParticipateNss withParticipate() {
        _query.xdoNss(() -> _query.queryParticipate());
        return new DbParticipateNss(_query.queryParticipate());
    }
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
