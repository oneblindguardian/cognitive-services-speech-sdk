//
// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See LICENSE.md file in the project root for full license information.
//
// speechapi_c_audio_config.h: Public API declarations for audio configuration related C methods and types
//

#pragma once
#include <speechapi_c_common.h>


SPXAPI_(bool) audio_config_is_handle_valid(SPXAUDIOCONFIGHANDLE haudioConfig);
SPXAPI audio_config_create_audio_input_from_default_microphone(SPXAUDIOCONFIGHANDLE* haudioConfig);
SPXAPI audio_config_create_audio_input_from_wav_file_name(SPXAUDIOCONFIGHANDLE* haudioConfig, const char* fileName);
SPXAPI audio_config_create_audio_input_from_stream(SPXAUDIOCONFIGHANDLE* haudioConfig, SPXAUDIOSTREAMHANDLE haudioStream);
SPXAPI audio_config_create_push_audio_input_stream(SPXAUDIOCONFIGHANDLE* haudioConfig, SPXAUDIOSTREAMHANDLE* haudioStream, SPXAUDIOSTREAMFORMATHANDLE hformat);
SPXAPI audio_config_create_pull_audio_input_stream(SPXAUDIOCONFIGHANDLE* haudioConfig, SPXAUDIOSTREAMHANDLE* haudioStream, SPXAUDIOSTREAMFORMATHANDLE hformat);
SPXAPI audio_config_release(SPXAUDIOCONFIGHANDLE haudioConfig);