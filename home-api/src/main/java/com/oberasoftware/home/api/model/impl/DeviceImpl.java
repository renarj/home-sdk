package com.oberasoftware.home.api.model.impl;

import com.oberasoftware.home.api.model.Device;

import java.util.Map;

/**
 * @author renarj
 */
public class DeviceImpl implements Device {
    private String controllerId;
    private String itemId;
    private Map<String, String> properties;

    public DeviceImpl(String controllerId, String itemId, Map<String, String> properties) {
        this.controllerId = controllerId;
        this.properties = properties;
        this.itemId = itemId;
    }

    @Override
    public String getControllerId() {
        return controllerId;
    }

    public void setControllerId(String controllerId) {
        this.controllerId = controllerId;
    }

    @Override
    public String getId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    @Override
    public Map<String, String> getProperties() {
        return properties;
    }

    public void setProperties(Map<String, String> properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "DeviceImpl{" +
                "controllerId='" + controllerId + '\'' +
                ", itemId='" + itemId + '\'' +
                ", properties=" + properties +
                '}';
    }
}
