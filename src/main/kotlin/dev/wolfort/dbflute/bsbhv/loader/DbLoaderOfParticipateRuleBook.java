package dev.wolfort.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import dev.wolfort.dbflute.exbhv.*;
import dev.wolfort.dbflute.exentity.*;

/**
 * The referrer loader of PARTICIPATE_RULE_BOOK as TABLE. <br>
 * <pre>
 * [primary key]
 *     participate_rule_book_id
 *
 * [column]
 *     participate_rule_book_id, participate_id, rule_book_id, register_datetime, register_trace, update_datetime, update_trace
 *
 * [sequence]
 *     
 *
 * [identity]
 *     participate_rule_book_id
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     PARTICIPATE, RULE_BOOK
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     participate, ruleBook
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class DbLoaderOfParticipateRuleBook {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<DbParticipateRuleBook> _selectedList;
    protected BehaviorSelector _selector;
    protected DbParticipateRuleBookBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public DbLoaderOfParticipateRuleBook ready(List<DbParticipateRuleBook> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected DbParticipateRuleBookBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(DbParticipateRuleBookBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected DbLoaderOfParticipate _foreignParticipateLoader;
    public DbLoaderOfParticipate pulloutParticipate() {
        if (_foreignParticipateLoader == null)
        { _foreignParticipateLoader = new DbLoaderOfParticipate().ready(myBhv().pulloutParticipate(_selectedList), _selector); }
        return _foreignParticipateLoader;
    }

    protected DbLoaderOfRuleBook _foreignRuleBookLoader;
    public DbLoaderOfRuleBook pulloutRuleBook() {
        if (_foreignRuleBookLoader == null)
        { _foreignRuleBookLoader = new DbLoaderOfRuleBook().ready(myBhv().pulloutRuleBook(_selectedList), _selector); }
        return _foreignRuleBookLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<DbParticipateRuleBook> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
