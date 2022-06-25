package dev.wolfort.dbflute.cbean.nss;

import dev.wolfort.dbflute.cbean.cq.DbUserFollowCQ;

/**
 * The nest select set-upper of user_follow.
 * @author DBFlute(AutoGenerator)
 */
public class DbUserFollowNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final DbUserFollowCQ _query;
    public DbUserFollowNss(DbUserFollowCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * USER by my from_user_id, named 'userByFromUserId'.
     */
    public void withUserByFromUserId() {
        _query.xdoNss(() -> _query.queryUserByFromUserId());
    }
    /**
     * With nested relation columns to select clause. <br>
     * USER by my to_user_id, named 'userByToUserId'.
     */
    public void withUserByToUserId() {
        _query.xdoNss(() -> _query.queryUserByToUserId());
    }
}
