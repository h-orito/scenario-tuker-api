package dev.wolfort.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import dev.wolfort.dbflute.exbhv.*;
import dev.wolfort.dbflute.exentity.*;

/**
 * The referrer loader of SCENARIO_AUTHOR as TABLE. <br>
 * <pre>
 * [primary key]
 *     scenario_author_id
 *
 * [column]
 *     scenario_author_id, scenario_id, author_id, register_datetime, register_trace, update_datetime, update_trace
 *
 * [sequence]
 *     
 *
 * [identity]
 *     scenario_author_id
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     AUTHOR, SCENARIO
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     author, scenario
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class DbLoaderOfScenarioAuthor {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<DbScenarioAuthor> _selectedList;
    protected BehaviorSelector _selector;
    protected DbScenarioAuthorBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public DbLoaderOfScenarioAuthor ready(List<DbScenarioAuthor> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected DbScenarioAuthorBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(DbScenarioAuthorBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected DbLoaderOfAuthor _foreignAuthorLoader;
    public DbLoaderOfAuthor pulloutAuthor() {
        if (_foreignAuthorLoader == null)
        { _foreignAuthorLoader = new DbLoaderOfAuthor().ready(myBhv().pulloutAuthor(_selectedList), _selector); }
        return _foreignAuthorLoader;
    }

    protected DbLoaderOfScenario _foreignScenarioLoader;
    public DbLoaderOfScenario pulloutScenario() {
        if (_foreignScenarioLoader == null)
        { _foreignScenarioLoader = new DbLoaderOfScenario().ready(myBhv().pulloutScenario(_selectedList), _selector); }
        return _foreignScenarioLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<DbScenarioAuthor> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
