"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import re  # noqa: F401
import sys  # noqa: F401

from baiduads.api_client import ApiClient, Endpoint as _Endpoint
from baiduads.model_utils import (  # noqa: F401
    check_allowed_values,
    check_validations,
    date,
    datetime,
    file_type,
    none_type,
    validate_and_convert_types
)
from baiduads.danubecreativegroup.model.add_danube_creative_group_request_wrapper import AddDanubeCreativeGroupRequestWrapper
from baiduads.danubecreativegroup.model.add_danube_creative_group_response_wrapper import AddDanubeCreativeGroupResponseWrapper
from baiduads.danubecreativegroup.model.copy_danube_creative_group_request_wrapper import CopyDanubeCreativeGroupRequestWrapper
from baiduads.danubecreativegroup.model.copy_danube_creative_group_response_wrapper import CopyDanubeCreativeGroupResponseWrapper
from baiduads.danubecreativegroup.model.delete_danube_creative_group_request_wrapper import DeleteDanubeCreativeGroupRequestWrapper
from baiduads.danubecreativegroup.model.delete_danube_creative_group_response_wrapper import DeleteDanubeCreativeGroupResponseWrapper
from baiduads.danubecreativegroup.model.get_danube_constants_request_wrapper import GetDanubeConstantsRequestWrapper
from baiduads.danubecreativegroup.model.get_danube_constants_response_wrapper import GetDanubeConstantsResponseWrapper
from baiduads.danubecreativegroup.model.get_danube_creative_group_request_wrapper import GetDanubeCreativeGroupRequestWrapper
from baiduads.danubecreativegroup.model.get_danube_creative_group_response_wrapper import GetDanubeCreativeGroupResponseWrapper
from baiduads.danubecreativegroup.model.update_danube_creative_group_request_wrapper import UpdateDanubeCreativeGroupRequestWrapper
from baiduads.danubecreativegroup.model.update_danube_creative_group_response_wrapper import UpdateDanubeCreativeGroupResponseWrapper


class DanubeCreativeGroupService(object):
    """NOTE: This class is auto generated by OpenAPI Generator
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client
        self.add_danube_creative_group_endpoint = _Endpoint(
            settings={
                'response_type': (AddDanubeCreativeGroupResponseWrapper,),
                'auth': [],
                'endpoint_path': '/json/sms/service/DanubeCreativeGroupService/addDanubeCreativeGroup',
                'operation_id': 'add_danube_creative_group',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'add_danube_creative_group_request_wrapper',
                ],
                'required': [
                    'add_danube_creative_group_request_wrapper',
                ],
                'nullable': [
                ],
                'enum': [
                ],
                'validation': [
                ]
            },
            root_map={
                'validations': {
                },
                'allowed_values': {
                },
                'openapi_types': {
                    'add_danube_creative_group_request_wrapper':
                        (AddDanubeCreativeGroupRequestWrapper,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'add_danube_creative_group_request_wrapper': 'body',
                },
                'collection_format_map': {
                }
            },
            headers_map={
                'accept': [
                    'application/json;charset=UTF-8'
                ],
                'content_type': [
                    'application/json;charset=UTF-8'
                ]
            },
            api_client=api_client
        )
        self.copy_danube_creative_group_endpoint = _Endpoint(
            settings={
                'response_type': (CopyDanubeCreativeGroupResponseWrapper,),
                'auth': [],
                'endpoint_path': '/json/sms/service/DanubeCreativeGroupService/copyDanubeCreativeGroup',
                'operation_id': 'copy_danube_creative_group',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'copy_danube_creative_group_request_wrapper',
                ],
                'required': [
                    'copy_danube_creative_group_request_wrapper',
                ],
                'nullable': [
                ],
                'enum': [
                ],
                'validation': [
                ]
            },
            root_map={
                'validations': {
                },
                'allowed_values': {
                },
                'openapi_types': {
                    'copy_danube_creative_group_request_wrapper':
                        (CopyDanubeCreativeGroupRequestWrapper,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'copy_danube_creative_group_request_wrapper': 'body',
                },
                'collection_format_map': {
                }
            },
            headers_map={
                'accept': [
                    'application/json;charset=UTF-8'
                ],
                'content_type': [
                    'application/json;charset=UTF-8'
                ]
            },
            api_client=api_client
        )
        self.delete_danube_creative_group_endpoint = _Endpoint(
            settings={
                'response_type': (DeleteDanubeCreativeGroupResponseWrapper,),
                'auth': [],
                'endpoint_path': '/json/sms/service/DanubeCreativeGroupService/deleteDanubeCreativeGroup',
                'operation_id': 'delete_danube_creative_group',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'delete_danube_creative_group_request_wrapper',
                ],
                'required': [
                    'delete_danube_creative_group_request_wrapper',
                ],
                'nullable': [
                ],
                'enum': [
                ],
                'validation': [
                ]
            },
            root_map={
                'validations': {
                },
                'allowed_values': {
                },
                'openapi_types': {
                    'delete_danube_creative_group_request_wrapper':
                        (DeleteDanubeCreativeGroupRequestWrapper,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'delete_danube_creative_group_request_wrapper': 'body',
                },
                'collection_format_map': {
                }
            },
            headers_map={
                'accept': [
                    'application/json;charset=UTF-8'
                ],
                'content_type': [
                    'application/json;charset=UTF-8'
                ]
            },
            api_client=api_client
        )
        self.get_danube_constants_endpoint = _Endpoint(
            settings={
                'response_type': (GetDanubeConstantsResponseWrapper,),
                'auth': [],
                'endpoint_path': '/json/sms/service/DanubeCreativeGroupService/getDanubeConstants',
                'operation_id': 'get_danube_constants',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'get_danube_constants_request_wrapper',
                ],
                'required': [
                    'get_danube_constants_request_wrapper',
                ],
                'nullable': [
                ],
                'enum': [
                ],
                'validation': [
                ]
            },
            root_map={
                'validations': {
                },
                'allowed_values': {
                },
                'openapi_types': {
                    'get_danube_constants_request_wrapper':
                        (GetDanubeConstantsRequestWrapper,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'get_danube_constants_request_wrapper': 'body',
                },
                'collection_format_map': {
                }
            },
            headers_map={
                'accept': [
                    'application/json;charset=UTF-8'
                ],
                'content_type': [
                    'application/json;charset=UTF-8'
                ]
            },
            api_client=api_client
        )
        self.get_danube_creative_group_endpoint = _Endpoint(
            settings={
                'response_type': (GetDanubeCreativeGroupResponseWrapper,),
                'auth': [],
                'endpoint_path': '/json/sms/service/DanubeCreativeGroupService/getDanubeCreativeGroup',
                'operation_id': 'get_danube_creative_group',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'get_danube_creative_group_request_wrapper',
                ],
                'required': [
                    'get_danube_creative_group_request_wrapper',
                ],
                'nullable': [
                ],
                'enum': [
                ],
                'validation': [
                ]
            },
            root_map={
                'validations': {
                },
                'allowed_values': {
                },
                'openapi_types': {
                    'get_danube_creative_group_request_wrapper':
                        (GetDanubeCreativeGroupRequestWrapper,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'get_danube_creative_group_request_wrapper': 'body',
                },
                'collection_format_map': {
                }
            },
            headers_map={
                'accept': [
                    'application/json;charset=UTF-8'
                ],
                'content_type': [
                    'application/json;charset=UTF-8'
                ]
            },
            api_client=api_client
        )
        self.update_danube_creative_group_endpoint = _Endpoint(
            settings={
                'response_type': (UpdateDanubeCreativeGroupResponseWrapper,),
                'auth': [],
                'endpoint_path': '/json/sms/service/DanubeCreativeGroupService/updateDanubeCreativeGroup',
                'operation_id': 'update_danube_creative_group',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'update_danube_creative_group_request_wrapper',
                ],
                'required': [
                    'update_danube_creative_group_request_wrapper',
                ],
                'nullable': [
                ],
                'enum': [
                ],
                'validation': [
                ]
            },
            root_map={
                'validations': {
                },
                'allowed_values': {
                },
                'openapi_types': {
                    'update_danube_creative_group_request_wrapper':
                        (UpdateDanubeCreativeGroupRequestWrapper,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'update_danube_creative_group_request_wrapper': 'body',
                },
                'collection_format_map': {
                }
            },
            headers_map={
                'accept': [
                    'application/json;charset=UTF-8'
                ],
                'content_type': [
                    'application/json;charset=UTF-8'
                ]
            },
            api_client=api_client
        )

    def add_danube_creative_group(
        self,
        add_danube_creative_group_request_wrapper,
        **kwargs
    ):
        """add_danube_creative_group  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.add_danube_creative_group(add_danube_creative_group_request_wrapper, async_req=True)
        >>> result = thread.get()

        Args:
            add_danube_creative_group_request_wrapper (AddDanubeCreativeGroupRequestWrapper):

        Keyword Args:
            _return_http_data_only (bool): response data without head status
                code and headers. Default is True.
            _preload_content (bool): if False, the urllib3.HTTPResponse object
                will be returned without reading/decoding response data.
                Default is True.
            _request_timeout (int/float/tuple): timeout setting for this request. If
                one number provided, it will be total request timeout. It can also
                be a pair (tuple) of (connection, read) timeouts.
                Default is None.
            _check_input_type (bool): specifies if type checking
                should be done one the data sent to the server.
                Default is True.
            _check_return_type (bool): specifies if type checking
                should be done one the data received from the server.
                Default is True.
            _content_type (str/None): force body content-type.
                Default is None and content-type will be predicted by allowed
                content-types and body.
            _host_index (int/None): specifies the index of the server
                that we want to use.
                Default is read from the configuration.
            async_req (bool): execute request asynchronously

        Returns:
            AddDanubeCreativeGroupResponseWrapper
                If the method is called asynchronously, returns the request
                thread.
        """
        kwargs['async_req'] = kwargs.get(
            'async_req', False
        )
        kwargs['_return_http_data_only'] = kwargs.get(
            '_return_http_data_only', True
        )
        kwargs['_preload_content'] = kwargs.get(
            '_preload_content', True
        )
        kwargs['_request_timeout'] = kwargs.get(
            '_request_timeout', None
        )
        kwargs['_check_input_type'] = kwargs.get(
            '_check_input_type', True
        )
        kwargs['_check_return_type'] = kwargs.get(
            '_check_return_type', True
        )
        kwargs['_spec_property_naming'] = kwargs.get(
            '_spec_property_naming', False
        )
        kwargs['_content_type'] = kwargs.get(
            '_content_type')
        kwargs['_host_index'] = kwargs.get('_host_index')
        kwargs['add_danube_creative_group_request_wrapper'] = \
            add_danube_creative_group_request_wrapper
        return self.add_danube_creative_group_endpoint.call_with_http_info(**kwargs)

    def copy_danube_creative_group(
        self,
        copy_danube_creative_group_request_wrapper,
        **kwargs
    ):
        """copy_danube_creative_group  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.copy_danube_creative_group(copy_danube_creative_group_request_wrapper, async_req=True)
        >>> result = thread.get()

        Args:
            copy_danube_creative_group_request_wrapper (CopyDanubeCreativeGroupRequestWrapper):

        Keyword Args:
            _return_http_data_only (bool): response data without head status
                code and headers. Default is True.
            _preload_content (bool): if False, the urllib3.HTTPResponse object
                will be returned without reading/decoding response data.
                Default is True.
            _request_timeout (int/float/tuple): timeout setting for this request. If
                one number provided, it will be total request timeout. It can also
                be a pair (tuple) of (connection, read) timeouts.
                Default is None.
            _check_input_type (bool): specifies if type checking
                should be done one the data sent to the server.
                Default is True.
            _check_return_type (bool): specifies if type checking
                should be done one the data received from the server.
                Default is True.
            _content_type (str/None): force body content-type.
                Default is None and content-type will be predicted by allowed
                content-types and body.
            _host_index (int/None): specifies the index of the server
                that we want to use.
                Default is read from the configuration.
            async_req (bool): execute request asynchronously

        Returns:
            CopyDanubeCreativeGroupResponseWrapper
                If the method is called asynchronously, returns the request
                thread.
        """
        kwargs['async_req'] = kwargs.get(
            'async_req', False
        )
        kwargs['_return_http_data_only'] = kwargs.get(
            '_return_http_data_only', True
        )
        kwargs['_preload_content'] = kwargs.get(
            '_preload_content', True
        )
        kwargs['_request_timeout'] = kwargs.get(
            '_request_timeout', None
        )
        kwargs['_check_input_type'] = kwargs.get(
            '_check_input_type', True
        )
        kwargs['_check_return_type'] = kwargs.get(
            '_check_return_type', True
        )
        kwargs['_spec_property_naming'] = kwargs.get(
            '_spec_property_naming', False
        )
        kwargs['_content_type'] = kwargs.get(
            '_content_type')
        kwargs['_host_index'] = kwargs.get('_host_index')
        kwargs['copy_danube_creative_group_request_wrapper'] = \
            copy_danube_creative_group_request_wrapper
        return self.copy_danube_creative_group_endpoint.call_with_http_info(**kwargs)

    def delete_danube_creative_group(
        self,
        delete_danube_creative_group_request_wrapper,
        **kwargs
    ):
        """delete_danube_creative_group  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.delete_danube_creative_group(delete_danube_creative_group_request_wrapper, async_req=True)
        >>> result = thread.get()

        Args:
            delete_danube_creative_group_request_wrapper (DeleteDanubeCreativeGroupRequestWrapper):

        Keyword Args:
            _return_http_data_only (bool): response data without head status
                code and headers. Default is True.
            _preload_content (bool): if False, the urllib3.HTTPResponse object
                will be returned without reading/decoding response data.
                Default is True.
            _request_timeout (int/float/tuple): timeout setting for this request. If
                one number provided, it will be total request timeout. It can also
                be a pair (tuple) of (connection, read) timeouts.
                Default is None.
            _check_input_type (bool): specifies if type checking
                should be done one the data sent to the server.
                Default is True.
            _check_return_type (bool): specifies if type checking
                should be done one the data received from the server.
                Default is True.
            _content_type (str/None): force body content-type.
                Default is None and content-type will be predicted by allowed
                content-types and body.
            _host_index (int/None): specifies the index of the server
                that we want to use.
                Default is read from the configuration.
            async_req (bool): execute request asynchronously

        Returns:
            DeleteDanubeCreativeGroupResponseWrapper
                If the method is called asynchronously, returns the request
                thread.
        """
        kwargs['async_req'] = kwargs.get(
            'async_req', False
        )
        kwargs['_return_http_data_only'] = kwargs.get(
            '_return_http_data_only', True
        )
        kwargs['_preload_content'] = kwargs.get(
            '_preload_content', True
        )
        kwargs['_request_timeout'] = kwargs.get(
            '_request_timeout', None
        )
        kwargs['_check_input_type'] = kwargs.get(
            '_check_input_type', True
        )
        kwargs['_check_return_type'] = kwargs.get(
            '_check_return_type', True
        )
        kwargs['_spec_property_naming'] = kwargs.get(
            '_spec_property_naming', False
        )
        kwargs['_content_type'] = kwargs.get(
            '_content_type')
        kwargs['_host_index'] = kwargs.get('_host_index')
        kwargs['delete_danube_creative_group_request_wrapper'] = \
            delete_danube_creative_group_request_wrapper
        return self.delete_danube_creative_group_endpoint.call_with_http_info(**kwargs)

    def get_danube_constants(
        self,
        get_danube_constants_request_wrapper,
        **kwargs
    ):
        """get_danube_constants  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.get_danube_constants(get_danube_constants_request_wrapper, async_req=True)
        >>> result = thread.get()

        Args:
            get_danube_constants_request_wrapper (GetDanubeConstantsRequestWrapper):

        Keyword Args:
            _return_http_data_only (bool): response data without head status
                code and headers. Default is True.
            _preload_content (bool): if False, the urllib3.HTTPResponse object
                will be returned without reading/decoding response data.
                Default is True.
            _request_timeout (int/float/tuple): timeout setting for this request. If
                one number provided, it will be total request timeout. It can also
                be a pair (tuple) of (connection, read) timeouts.
                Default is None.
            _check_input_type (bool): specifies if type checking
                should be done one the data sent to the server.
                Default is True.
            _check_return_type (bool): specifies if type checking
                should be done one the data received from the server.
                Default is True.
            _content_type (str/None): force body content-type.
                Default is None and content-type will be predicted by allowed
                content-types and body.
            _host_index (int/None): specifies the index of the server
                that we want to use.
                Default is read from the configuration.
            async_req (bool): execute request asynchronously

        Returns:
            GetDanubeConstantsResponseWrapper
                If the method is called asynchronously, returns the request
                thread.
        """
        kwargs['async_req'] = kwargs.get(
            'async_req', False
        )
        kwargs['_return_http_data_only'] = kwargs.get(
            '_return_http_data_only', True
        )
        kwargs['_preload_content'] = kwargs.get(
            '_preload_content', True
        )
        kwargs['_request_timeout'] = kwargs.get(
            '_request_timeout', None
        )
        kwargs['_check_input_type'] = kwargs.get(
            '_check_input_type', True
        )
        kwargs['_check_return_type'] = kwargs.get(
            '_check_return_type', True
        )
        kwargs['_spec_property_naming'] = kwargs.get(
            '_spec_property_naming', False
        )
        kwargs['_content_type'] = kwargs.get(
            '_content_type')
        kwargs['_host_index'] = kwargs.get('_host_index')
        kwargs['get_danube_constants_request_wrapper'] = \
            get_danube_constants_request_wrapper
        return self.get_danube_constants_endpoint.call_with_http_info(**kwargs)

    def get_danube_creative_group(
        self,
        get_danube_creative_group_request_wrapper,
        **kwargs
    ):
        """get_danube_creative_group  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.get_danube_creative_group(get_danube_creative_group_request_wrapper, async_req=True)
        >>> result = thread.get()

        Args:
            get_danube_creative_group_request_wrapper (GetDanubeCreativeGroupRequestWrapper):

        Keyword Args:
            _return_http_data_only (bool): response data without head status
                code and headers. Default is True.
            _preload_content (bool): if False, the urllib3.HTTPResponse object
                will be returned without reading/decoding response data.
                Default is True.
            _request_timeout (int/float/tuple): timeout setting for this request. If
                one number provided, it will be total request timeout. It can also
                be a pair (tuple) of (connection, read) timeouts.
                Default is None.
            _check_input_type (bool): specifies if type checking
                should be done one the data sent to the server.
                Default is True.
            _check_return_type (bool): specifies if type checking
                should be done one the data received from the server.
                Default is True.
            _content_type (str/None): force body content-type.
                Default is None and content-type will be predicted by allowed
                content-types and body.
            _host_index (int/None): specifies the index of the server
                that we want to use.
                Default is read from the configuration.
            async_req (bool): execute request asynchronously

        Returns:
            GetDanubeCreativeGroupResponseWrapper
                If the method is called asynchronously, returns the request
                thread.
        """
        kwargs['async_req'] = kwargs.get(
            'async_req', False
        )
        kwargs['_return_http_data_only'] = kwargs.get(
            '_return_http_data_only', True
        )
        kwargs['_preload_content'] = kwargs.get(
            '_preload_content', True
        )
        kwargs['_request_timeout'] = kwargs.get(
            '_request_timeout', None
        )
        kwargs['_check_input_type'] = kwargs.get(
            '_check_input_type', True
        )
        kwargs['_check_return_type'] = kwargs.get(
            '_check_return_type', True
        )
        kwargs['_spec_property_naming'] = kwargs.get(
            '_spec_property_naming', False
        )
        kwargs['_content_type'] = kwargs.get(
            '_content_type')
        kwargs['_host_index'] = kwargs.get('_host_index')
        kwargs['get_danube_creative_group_request_wrapper'] = \
            get_danube_creative_group_request_wrapper
        return self.get_danube_creative_group_endpoint.call_with_http_info(**kwargs)

    def update_danube_creative_group(
        self,
        update_danube_creative_group_request_wrapper,
        **kwargs
    ):
        """update_danube_creative_group  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.update_danube_creative_group(update_danube_creative_group_request_wrapper, async_req=True)
        >>> result = thread.get()

        Args:
            update_danube_creative_group_request_wrapper (UpdateDanubeCreativeGroupRequestWrapper):

        Keyword Args:
            _return_http_data_only (bool): response data without head status
                code and headers. Default is True.
            _preload_content (bool): if False, the urllib3.HTTPResponse object
                will be returned without reading/decoding response data.
                Default is True.
            _request_timeout (int/float/tuple): timeout setting for this request. If
                one number provided, it will be total request timeout. It can also
                be a pair (tuple) of (connection, read) timeouts.
                Default is None.
            _check_input_type (bool): specifies if type checking
                should be done one the data sent to the server.
                Default is True.
            _check_return_type (bool): specifies if type checking
                should be done one the data received from the server.
                Default is True.
            _content_type (str/None): force body content-type.
                Default is None and content-type will be predicted by allowed
                content-types and body.
            _host_index (int/None): specifies the index of the server
                that we want to use.
                Default is read from the configuration.
            async_req (bool): execute request asynchronously

        Returns:
            UpdateDanubeCreativeGroupResponseWrapper
                If the method is called asynchronously, returns the request
                thread.
        """
        kwargs['async_req'] = kwargs.get(
            'async_req', False
        )
        kwargs['_return_http_data_only'] = kwargs.get(
            '_return_http_data_only', True
        )
        kwargs['_preload_content'] = kwargs.get(
            '_preload_content', True
        )
        kwargs['_request_timeout'] = kwargs.get(
            '_request_timeout', None
        )
        kwargs['_check_input_type'] = kwargs.get(
            '_check_input_type', True
        )
        kwargs['_check_return_type'] = kwargs.get(
            '_check_return_type', True
        )
        kwargs['_spec_property_naming'] = kwargs.get(
            '_spec_property_naming', False
        )
        kwargs['_content_type'] = kwargs.get(
            '_content_type')
        kwargs['_host_index'] = kwargs.get('_host_index')
        kwargs['update_danube_creative_group_request_wrapper'] = \
            update_danube_creative_group_request_wrapper
        return self.update_danube_creative_group_endpoint.call_with_http_info(**kwargs)

