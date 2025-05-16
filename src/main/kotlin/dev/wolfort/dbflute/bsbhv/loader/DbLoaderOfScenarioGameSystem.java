package dev.wolfort.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import dev.wolfort.dbflute.exbhv.*;
import dev.wolfort.dbflute.exentity.*;

/**
 * The referrer loader of SCENARIO_GAME_SYSTEM as TABLE. <br>
 * <pre>
 * [primary key]
 *     scenario_game_system_id
 *
 * [column]
 *     scenario_game_system_id, scenario_id, game_system_id, register_datetime, register_trace, update_datetime, update_trace
 *
 * [sequence]
 *     
 *
 * [identity]
 *     scenario_game_system_id
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     GAME_SYSTEM, SCENARIO
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     gameSystem, scenario
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class DbLoaderOfScenarioGameSystem {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<DbScenarioGameSystem> _selectedList;
    protected BehaviorSelector _selector;
    protected DbScenarioGameSystemBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public DbLoaderOfScenarioGameSystem ready(List<DbScenarioGameSystem> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected DbScenarioGameSystemBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(DbScenarioGameSystemBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected DbLoaderOfGameSystem _foreignGameSystemLoader;
    public DbLoaderOfGameSystem pulloutGameSystem() {
        if (_foreignGameSystemLoader == null)
        { _foreignGameSystemLoader = new DbLoaderOfGameSystem().ready(myBhv().pulloutGameSystem(_selectedList), _selector); }
        return _foreignGameSystemLoader;
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
    public List<DbScenarioGameSystem> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
