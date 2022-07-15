package dev.wolfort.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import dev.wolfort.dbflute.exbhv.*;
import dev.wolfort.dbflute.exentity.*;

/**
 * The referrer loader of USER_RULE_BOOK as TABLE. <br>
 * <pre>
 * [primary key]
 *     user_rule_book_id
 *
 * [column]
 *     user_rule_book_id, user_id, rule_book_id, register_datetime, register_trace, update_datetime, update_trace
 *
 * [sequence]
 *     
 *
 * [identity]
 *     user_rule_book_id
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     RULE_BOOK, USER
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     ruleBook, user
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class DbLoaderOfUserRuleBook {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<DbUserRuleBook> _selectedList;
    protected BehaviorSelector _selector;
    protected DbUserRuleBookBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public DbLoaderOfUserRuleBook ready(List<DbUserRuleBook> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected DbUserRuleBookBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(DbUserRuleBookBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected DbLoaderOfRuleBook _foreignRuleBookLoader;
    public DbLoaderOfRuleBook pulloutRuleBook() {
        if (_foreignRuleBookLoader == null)
        { _foreignRuleBookLoader = new DbLoaderOfRuleBook().ready(myBhv().pulloutRuleBook(_selectedList), _selector); }
        return _foreignRuleBookLoader;
    }

    protected DbLoaderOfUser _foreignUserLoader;
    public DbLoaderOfUser pulloutUser() {
        if (_foreignUserLoader == null)
        { _foreignUserLoader = new DbLoaderOfUser().ready(myBhv().pulloutUser(_selectedList), _selector); }
        return _foreignUserLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<DbUserRuleBook> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
