package org.liquidengine.legui.component;

import org.joml.Vector2f;
import org.liquidengine.legui.event.system.SystemWindowSizeEvent;
import org.liquidengine.legui.listener.SystemEventListener;
import org.liquidengine.legui.util.ColorConstants;

/**
 * Created by Aliaksandr_Shcherbin on 12/13/2016.
 */
public class Frame extends ComponentContainer {
    public Frame() {
        initialize();
    }

    public Frame(float width, float height) {
        size.set(width, height);
        initialize();
    }

    public Frame(Vector2f size) {
        super(new Vector2f(0), size);
        initialize();
    }

    @Override
    public void setPosition(Vector2f position) {
    }

    @Override
    public void setPosition(float x, float y) {
    }

    @Override
    public void setSize(Vector2f size) {
    }

    @Override
    public void setSize(float width, float height) {
    }

    private void initialize() {
        border = null;
        this.systemEventListeners
                .setListener(SystemWindowSizeEvent.class,
                        (SystemEventListener<Frame, SystemWindowSizeEvent>)
                                (event, component, context) ->
                                        this.size.set(event.width, event.height)
                );
        backgroundColor = ColorConstants.transparent();
        position.set(0);
    }
}
