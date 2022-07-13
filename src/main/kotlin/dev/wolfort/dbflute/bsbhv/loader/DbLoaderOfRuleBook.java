package dev.wolfort.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import dev.wolfort.dbflute.exbhv.*;
import dev.wolfort.dbflute.exentity.*;
import dev.wolfort.dbflute.cbean.*;

/**
 * The referrer loader of RULE_BOOK as TABLE. <br>
 * <pre>
 * [primary key]
 *     rule_book_id
 *
 * [column]
 *     rule_book_id, game_system_id, rule_book_name, rule_book_type, register_datetime, register_trace, update_datetime, update_trace
 *
 * [sequence]
 *     
 *
 * [identity]
 *     rule_book_id
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     GAME_SYSTEM
 *
 * [referrer table]
 *     PARTICIPATE_RULE_BOOK, RULE_BOOK_DICTIONARY
 *
 * [foreign property]
 *     gameSystem
 *
 * [referrer property]
 *     participateRuleBookList, ruleBookDictionaryList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class DbLoaderOfRuleBook {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<DbRuleBook> _selectedList;
    protected BehaviorSelector _selector;
    protected DbRuleBookBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public DbLoaderOfRuleBook ready(List<DbRuleBook> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected DbRuleBookBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(DbRuleBookBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<DbParticipateRuleBook> _referrerParticipateRuleBook;

    /**
     * Load referrer of participateRuleBookList by the set-upper of referrer. <br>
     * PARTICIPATE_RULE_BOOK by rule_book_id, named 'participateRuleBookList'.
     * <pre>
     * <span style="color: #0000C0">ruleBookBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">ruleBookList</span>, <span style="color: #553000">bookLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bookLoader</span>.<span style="color: #CC4747">loadParticipateRuleBook</span>(<span style="color: #553000">bookCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">bookCB</span>.setupSelect...
     *         <span style="color: #553000">bookCB</span>.query().set...
     *         <span style="color: #553000">bookCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">bookLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    bookLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (DbRuleBook ruleBook : <span style="color: #553000">ruleBookList</span>) {
     *     ... = ruleBook.<span style="color: #CC4747">getParticipateRuleBookList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setRuleBookId_InScope(pkList);
     * cb.query().addOrderBy_RuleBookId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<DbLoaderOfParticipateRuleBook> loadParticipateRuleBook(ReferrerConditionSetupper<DbParticipateRuleBookCB> refCBLambda) {
        myBhv().loadParticipateRuleBook(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerParticipateRuleBook = refLs);
        return hd -> hd.handle(new DbLoaderOfParticipateRuleBook().ready(_referrerParticipateRuleBook, _selector));
    }

    protected List<DbRuleBookDictionary> _referrerRuleBookDictionary;

    /**
     * Load referrer of ruleBookDictionaryList by the set-upper of referrer. <br>
     * RULE_BOOK_DICTIONARY by rule_book_id, named 'ruleBookDictionaryList'.
     * <pre>
     * <span style="color: #0000C0">ruleBookBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">ruleBookList</span>, <span style="color: #553000">bookLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bookLoader</span>.<span style="color: #CC4747">loadRuleBookDictionary</span>(<span style="color: #553000">dictionaryCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">dictionaryCB</span>.setupSelect...
     *         <span style="color: #553000">dictionaryCB</span>.query().set...
     *         <span style="color: #553000">dictionaryCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">dictionaryLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    dictionaryLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (DbRuleBook ruleBook : <span style="color: #553000">ruleBookList</span>) {
     *     ... = ruleBook.<span style="color: #CC4747">getRuleBookDictionaryList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setRuleBookId_InScope(pkList);
     * cb.query().addOrderBy_RuleBookId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<DbLoaderOfRuleBookDictionary> loadRuleBookDictionary(ReferrerConditionSetupper<DbRuleBookDictionaryCB> refCBLambda) {
        myBhv().loadRuleBookDictionary(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerRuleBookDictionary = refLs);
        return hd -> hd.handle(new DbLoaderOfRuleBookDictionary().ready(_referrerRuleBookDictionary, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected DbLoaderOfGameSystem _foreignGameSystemLoader;
    public DbLoaderOfGameSystem pulloutGameSystem() {
        if (_foreignGameSystemLoader == null)
        { _foreignGameSystemLoader = new DbLoaderOfGameSystem().ready(myBhv().pulloutGameSystem(_selectedList), _selector); }
        return _foreignGameSystemLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<DbRuleBook> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
