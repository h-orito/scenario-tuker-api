package dev.wolfort.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import dev.wolfort.dbflute.exbhv.*;
import dev.wolfort.dbflute.exentity.*;

/**
 * The referrer loader of RULE_BOOK_DICTIONARY as TABLE. <br>
 * <pre>
 * [primary key]
 *     rule_book_dictionary_id
 *
 * [column]
 *     rule_book_dictionary_id, rule_book_id, rule_book_name, register_datetime, register_trace, update_datetime, update_trace
 *
 * [sequence]
 *     
 *
 * [identity]
 *     rule_book_dictionary_id
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     RULE_BOOK
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     ruleBook
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class DbLoaderOfRuleBookDictionary {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<DbRuleBookDictionary> _selectedList;
    protected BehaviorSelector _selector;
    protected DbRuleBookDictionaryBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public DbLoaderOfRuleBookDictionary ready(List<DbRuleBookDictionary> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected DbRuleBookDictionaryBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(DbRuleBookDictionaryBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected DbLoaderOfRuleBook _foreignRuleBookLoader;
    public DbLoaderOfRuleBook pulloutRuleBook() {
        if (_foreignRuleBookLoader == null)
        { _foreignRuleBookLoader = new DbLoaderOfRuleBook().ready(myBhv().pulloutRuleBook(_selectedList), _selector); }
        return _foreignRuleBookLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<DbRuleBookDictionary> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
