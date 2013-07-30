package com.facebook.presto.metadata;

import com.google.common.base.Optional;

import java.util.Set;

public interface NodeManager
{
    Set<Node> getActiveDatasourceNodes(String datasourceName);

    AllNodes getAllNodes();

    Optional<Node> getCurrentNode();

    void refreshNodes(boolean force);
}