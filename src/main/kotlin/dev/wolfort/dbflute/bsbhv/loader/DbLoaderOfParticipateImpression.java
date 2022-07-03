package dev.wolfort.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import dev.wolfort.dbflute.exbhv.*;
import dev.wolfort.dbflute.exentity.*;

/**
 * The referrer loader of PARTICIPATE_IMPRESSION as TABLE. <br>
 * <pre>
 * [primary key]
 *     participate_impression_id
 *
 * [column]
 *     participate_impression_id, participate_id, has_spoiler, disclosure_range, impression, register_datetime, register_trace, update_datetime, update_trace
 *
 * [sequence]
 *     
 *
 * [identity]
 *     participate_impression_id
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     PARTICIPATE
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     participate
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class DbLoaderOfParticipateImpression {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<DbParticipateImpression> _selectedList;
    protected BehaviorSelector _selector;
    protected DbParticipateImpressionBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public DbLoaderOfParticipateImpression ready(List<DbParticipateImpression> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected DbParticipateImpressionBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(DbParticipateImpressionBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected DbLoaderOfParticipate _foreignParticipateLoader;
    public DbLoaderOfParticipate pulloutParticipate() {
        if (_foreignParticipateLoader == null)
        { _foreignParticipateLoader = new DbLoaderOfParticipate().ready(myBhv().pulloutParticipate(_selectedList), _selector); }
        return _foreignParticipateLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<DbParticipateImpression> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
