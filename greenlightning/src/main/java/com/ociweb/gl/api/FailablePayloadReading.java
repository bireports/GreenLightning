package com.ociweb.gl.api;

import com.ociweb.pronghorn.pipe.ChannelReader;

public interface FailablePayloadReading {

	boolean read(ChannelReader reader);

}
