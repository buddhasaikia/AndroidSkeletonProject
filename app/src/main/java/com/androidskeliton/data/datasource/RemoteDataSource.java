package com.androidskeliton.data.datasource;


import com.androidskeliton.data.api.ApiService;
import com.androidskeliton.data.datasource.base.BaseDataSource;
import com.androidskeliton.data.datasource.base.DataSource;

/**
 * Created by Buddha Saikia on 03-06-2017.
 */

public class RemoteDataSource extends BaseDataSource implements DataSource {

    private ApiService apiService;

    public RemoteDataSource(ApiService apiService) {
        this.apiService = apiService;
    }

}
