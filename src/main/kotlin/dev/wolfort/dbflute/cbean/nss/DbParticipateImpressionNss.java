package dev.wolfort.dbflute.cbean.nss;

import dev.wolfort.dbflute.cbean.cq.DbParticipateImpressionCQ;

/**
 * The nest select set-upper of participate_impression.
 * @author DBFlute(AutoGenerator)
 */
public class DbParticipateImpressionNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final DbParticipateImpressionCQ _query;
    public DbParticipateImpressionNss(DbParticipateImpressionCQ query) { _query = query; }
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
}
