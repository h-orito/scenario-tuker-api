package dev.wolfort.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import dev.wolfort.dbflute.exbhv.*;
import dev.wolfort.dbflute.exentity.*;

/**
 * The referrer loader of SCENARIO_DICTIONARY as TABLE. <br>
 * <pre>
 * [primary key]
 *     scenario_detail_id
 *
 * [column]
 *     scenario_detail_id, scenario_id, scenario_name, register_datetime, register_trace, update_datetime, update_trace
 *
 * [sequence]
 *     
 *
 * [identity]
 *     scenario_detail_id
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     SCENARIO
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     scenario
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class DbLoaderOfScenarioDictionary {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<DbScenarioDictionary> _selectedList;
    protected BehaviorSelector _selector;
    protected DbScenarioDictionaryBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public DbLoaderOfScenarioDictionary ready(List<DbScenarioDictionary> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected DbScenarioDictionaryBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(DbScenarioDictionaryBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected DbLoaderOfScenario _foreignScenarioLoader;
    public DbLoaderOfScenario pulloutScenario() {
        if (_foreignScenarioLoader == null)
        { _foreignScenarioLoader = new DbLoaderOfScenario().ready(myBhv().pulloutScenario(_selectedList), _selector); }
        return _foreignScenarioLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<DbScenarioDictionary> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
