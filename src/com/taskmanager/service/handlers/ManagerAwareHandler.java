package com.taskmanager.service.handlers;

import com.taskmanager.service.managers.TaskManager;

abstract class ManagerAwareHandler extends BaseHttpHandler {
    protected TaskManager manager;

    private ManagerAwareHandler() {
    }

    public ManagerAwareHandler(TaskManager manager) {
        super();
        this.manager = manager;
    }

}
