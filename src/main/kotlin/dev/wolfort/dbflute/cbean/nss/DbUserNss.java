package dev.wolfort.dbflute.cbean.nss;

import dev.wolfort.dbflute.cbean.cq.DbUserCQ;

/**
 * The nest select set-upper of user.
 * @author DBFlute(AutoGenerator)
 */
public class DbUserNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final DbUserCQ _query;
    public DbUserNss(DbUserCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * twitter_user by user_id, named 'twitterUserAsOne'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public DbTwitterUserNss withTwitterUserAsOne() {
        _query.xdoNss(() -> _query.queryTwitterUserAsOne());
        return new DbTwitterUserNss(_query.queryTwitterUserAsOne());
    }
}
