package com.company.tasks;

import com.company.data.LocationsData;

import java.util.List;

public interface ILocations {

    LocationsData getClosestLocation(List<LocationsData> locations);

}
